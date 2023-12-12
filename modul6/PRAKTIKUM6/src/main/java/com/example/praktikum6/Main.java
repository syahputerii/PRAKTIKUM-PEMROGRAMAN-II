package com.example.praktikum6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Main implements Initializable {
    @FXML
    private TableView<Mahasiswa> tvMahasiswa;
    @FXML
    private TableColumn<Mahasiswa, String> tcNIM;
    @FXML
    private TableColumn<Mahasiswa, String> tcNama;

    private final Mahasiswa [] MAHASISWA_LIST = {
            new Mahasiswa(1111, "Rini Nor Hidayah", "2210817120001"),
            new Mahasiswa(2222, "Siti NurHaifa", "2210817120002"),
            new Mahasiswa(3333, "Zahra Ayu Luthfiyana", "2210817120003"),
            new Mahasiswa(4444, "Aprilia Ananda", "2210817120004"),
            new Mahasiswa(5555, "Meldiana Handayani", "2210817120005"),
            new Mahasiswa(6666, "Ajeng Diah Pramesti", "2210817120006"),
            new Mahasiswa(7777, "Nursyahna Puteri", "2210817120007"),
            new Mahasiswa(8888, "Valerie Pola", "2210817120008"),
            new Mahasiswa(9999, "Melody Saa", "2210817120009"),
            new Mahasiswa(1010, "Jessica Halim", "2210817120010"),
    };
    private final ObservableList <Mahasiswa> mahasiswaList = FXCollections.observableArrayList(MAHASISWA_LIST);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcNIM.setCellValueFactory(new PropertyValueFactory<>("Nim"));
        tcNama.setCellValueFactory(new PropertyValueFactory<>("Nama"));

        tvMahasiswa.setItems(mahasiswaList);
    }
}