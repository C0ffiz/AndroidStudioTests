package com.teste.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.teste.recyclerview.R;
import com.teste.recyclerview.adapter.Adapter;
import com.teste.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter( listaFilmes );

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getApplicationContext() );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Evento de click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get( position );
                            Toast.makeText(
                                    getApplicationContext(),
                                    filme.getTituloFilme() + " - " + filme.getAno(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Filme filme = listaFilmes.get( position );
                            Toast.makeText(
                                    getApplicationContext(),
                                    filme.getGenero(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    }
            )
        );
    }

        //Adicionar filmes ao array listaFilmes
        public void criarFilmes(){
            Filme filme = new Filme("Homem Aranha - De volta ao lar", "Aventura", "2017"  );
            this.listaFilmes.add( filme );

            filme = new Filme("Mulher Maravilha", "Fantasia", "2017"  );
            this.listaFilmes.add( filme );

            filme = new Filme("Liga da Justiça", "Ficção", "2017"  );
            this.listaFilmes.add( filme );

            filme = new Filme("Capitão América - Guerra Civil", "Aventura/Ficção", "2016"  );
            this.listaFilmes.add( filme );

            filme = new Filme("It: A Coisa", "Drama/Terror", "2017"  );
            this.listaFilmes.add( filme );

            filme = new Filme("TEST1", "Terror", "2077"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST2", "Terror", "2078"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST3", "Terror", "2079"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST4", "Terror", "2080"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST5", "Terror", "2081"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST6", "Terror", "2082"  );
                this.listaFilmes.add( filme );

            filme = new Filme("TEST7", "Terror", "2083"  );
                this.listaFilmes.add( filme );

        }

}