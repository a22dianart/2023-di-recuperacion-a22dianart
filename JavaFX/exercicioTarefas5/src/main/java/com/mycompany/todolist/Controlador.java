package com.mycompany.todolist;

import com.mycompany.todolist.datamodel.Tarefa;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;

public class Controlador {

    @FXML
    private ListView<Tarefa> tarefasListView;
    @FXML
    private TextArea informacionArea;
    @FXML
    private Label datatarefaSeleccionada;
    @FXML
    private BorderPane mainBorderPane;

    private ContextMenu listContextMenu;
    @FXML
    private Button novaTarefaBtn;

    private SortedList<Tarefa> tarefasOrdenadas;
    private FilteredList<Tarefa> tarefasFiltradas;
    private Comparator<Tarefa> comparator;
    @FXML
    private ToggleButton hoxeToggle;


    private Tarefa tarefaSeleccionadaAntes;

    private boolean  tarefaSeleccionada=false;
    private Tarefa tarefaSeleccionar=null;

    public void initialize() {





        novaTarefaBtn.setTooltip(new Tooltip("Crear unha nova tarefa"));
        Image image = new Image(getClass().getResourceAsStream("/images/novaTarefa.gif"));
        ImageView imageView = new ImageView(image);
        novaTarefaBtn.setGraphic(imageView);

        tarefasFiltradas= new FilteredList<>(TarefasFicheiro.getInstance().getTarefas());

        hoxeToggle.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (t1){


                    tarefasFiltradas.setPredicate(new Predicate<Tarefa>() {
                        @Override
                        public boolean test(Tarefa tarefa) {
                            if(tarefa.getDataLimite().isEqual(LocalDate.now())){

                                if(tarefa.equals(tarefaSeleccionadaAntes)){
                                    tarefaSeleccionada=true;
                                    tarefaSeleccionar=tarefa;

                                }
                                return true;
                            }else{
                                return false;
                            }
                        }
                    });
                    if(tarefaSeleccionada){
                        tarefasListView.getSelectionModel().select(tarefaSeleccionadaAntes);
                    }else{
                        tarefasListView.getSelectionModel().select(0);
                    }



                }
                else {
                    tarefasFiltradas.setPredicate(null);
                }
            }
        });



        tarefasOrdenadas = new SortedList<>(tarefasFiltradas);

        tarefasOrdenadas.setComparator(new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) { //0 iguais, negativo antes o1, positivo antes o2
                return o1.getDataLimite().compareTo(o2.getDataLimite()); //IMPORTANTE


            }
        });


        tarefasListView.setItems(tarefasOrdenadas);
        tarefasListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tarefa>() { //IMPORTANTE
            @Override
            public void changed(ObservableValue<? extends Tarefa> observableValue, Tarefa tarefa, Tarefa t1) {
                if(t1!=null){
                    mostrarTarefa();
                    tarefaSeleccionadaAntes=t1;
                }
            }

        });
        tarefasListView.getSelectionModel().select(0); //detras do listener para que mostre a primeira tarefa!!!





        //MENU CONTEXTUAL
        listContextMenu = new ContextMenu();
// Crea un elemento do menú para a opción borrar
        MenuItem deleteMenuItem = new MenuItem("Borrar");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Tarefa tarefaSeleccionada = tarefasListView.getSelectionModel().getSelectedItem();
                borrarTarefa(tarefaSeleccionada);
            }
        });


        listContextMenu.getItems().addAll(deleteMenuItem);

        tarefasListView.setCellFactory(new Callback<ListView<Tarefa>, ListCell<Tarefa>>() {
            @Override
            public ListCell<Tarefa> call(ListView<Tarefa> p) {


                ListCell<Tarefa> cela = new ListCell<>() {
                    @Override
                    protected void updateItem(Tarefa t, boolean empty) {
                        super.updateItem(t, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(t.getDescricion());
                            if (t.getDataLimite().equals(LocalDate.now())||t.getDataLimite().isBefore(LocalDate.now())) {
                                setTextFill(Color.RED);
                            } else if (t.getDataLimite().equals(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.ORANGE);

                            }
                        }
                    }
                };

                cela.emptyProperty().addListener(((obs, wasEmpty, isNowEmpty) -> {
                    if (isNowEmpty) {
                        cela.setContextMenu(null);
                    } else {
                        cela.setContextMenu(listContextMenu);
                    }
                }));
                return cela;
            }
        });
        tarefasListView.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if (e.getCode() == javafx.scene.input.KeyCode.DELETE) {
                    Tarefa tarefaBorrar = tarefasListView.getSelectionModel().getSelectedItem();
                    borrarTarefa(tarefaBorrar);
                }


            }
        });






    }

    @FXML
    public void mostrarTarefa() {
        Tarefa tarefaSeleccionada = tarefasListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder();
        sb.append(tarefaSeleccionada.getDetalles());
        informacionArea.setText(sb.toString());

        LocalDate data = tarefaSeleccionada.getDataLimite();

        Locale galicianLocale = new Locale("gl", "ES");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", galicianLocale);
        String dataFormateada = data.format(formatter);

        datatarefaSeleccionada.setText(dataFormateada);
    }

    @FXML
    public void onSairClick(ActionEvent actionEvent) {
        System.exit(0);

    }

    @FXML
    public void onNovoClick(ActionEvent actionEvent) {
        mostrarDialogoNovaTarefa();
    }

    public void mostrarDialogoNovaTarefa(){
        Dialog<ButtonType> dialog = new Dialog<>();

        dialog.initOwner(mainBorderPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("novaTarefaDialogo.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Non se puido cargar o diálogo");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            NovaTarefaDialogoController controladorDialogo = fxmlLoader.getController();
            Tarefa novaTarefa = controladorDialogo.procesarResultados();

            tarefasListView.getSelectionModel().select(novaTarefa); //para que se seleccione a nova tarefa
        } else {
            System.out.println("Cancel pressed");
        }
    }
    private void borrarTarefa(Tarefa tarefa){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to format your system?");
        alert.setTitle("Borrar tarefa");
        alert.setHeaderText("Borrar tarefa: "+tarefa.getDescricion());
        alert.setContentText("Desexa eliminar a tarefa? Pulse Ok para confirmar ou Cancel en caso contrario");

        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.isPresent() && (resultado.get() == ButtonType.OK)) {
            TarefasFicheiro.getInstance().borrarTarefa(tarefa);
        }

    }

    public void mostrarDialogoEditar(){
        Dialog<ButtonType> dialog = new Dialog<>();

        dialog.initOwner(mainBorderPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("editarTarefaDialogo.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Non se puido cargar o diálogo");
            e.printStackTrace();
            return;
        }

        EditarTarefaDialogoController controladorDialogo = fxmlLoader.getController();
        Tarefa tarefaCambiar = tarefasListView.getSelectionModel().getSelectedItem();
        controladorDialogo.setTarefaEditar(tarefaCambiar);

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {

            Tarefa nova = controladorDialogo.procesarResultado();

            tarefasListView.getSelectionModel().clearSelection(); //IMPORTANTE PARA QUE CAMBIE O DO CENTRO
            tarefasListView.getSelectionModel().select(nova); //para que se seleccione a nova tarefa
        } else {
            System.out.println("Cancel pressed");
        }
       // tarefasListView.refresh();//NON É NECESARIO


    }


    @FXML
    public void onEditarClick(ActionEvent actionEvent) {
        mostrarDialogoEditar();

    }


}