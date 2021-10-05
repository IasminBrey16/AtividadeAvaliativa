package com.example.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividadeavaliativa.Model.ElementoDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvLista;
    FloatingActionButton fabAdicionar;
    ElementoDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new ElementoDAO();
        rvLista = findViewById(R.id.rvLista);
        fabAdicionar = findViewById(R.id.fabAdicionar);

        fabAdicionar.setOnClickListener(v -> startActivity(new Intent(this, CadastrarActivity.class)));
        rvLista.addOnScrollListener(dao);
    }
}