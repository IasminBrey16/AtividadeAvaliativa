package com.example.atividadeavaliativa.Model;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ElementoDAO extends RecyclerView.OnScrollListener {

    private static List<Elemento> elementos = new ArrayList<>();

    public void adicionar (Elemento elemento){ elementos.add(elemento); }
}
