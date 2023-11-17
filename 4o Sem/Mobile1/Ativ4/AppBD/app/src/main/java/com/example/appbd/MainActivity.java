package com.example.appbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edtNome;
    private EditText edtMatricula;
    private Button btnSalvar;
    private ListView lview;
    private Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtMatricula = findViewById(R.id.edtMatricula);
        btnSalvar = findViewById(R.id.btnSalvar);
        lview = findViewById(R.id.lview);
        db = new Database(this);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Estudante e = new Estudante();
                e.setNome(edtNome.getText().toString());
                e.setMatricula(edtMatricula.getText().toString());

                EstudanteDAO eDAO = new EstudanteDAO(db);
                eDAO.salvar(e);
                preencherListView();
            }
        });
        preencherListView();
    }
    public void preencherListView(){
        EstudanteDAO eDAO = new EstudanteDAO(db);
        List<Estudante> todos = eDAO.buscarTodos();
        String[] array = new String[todos.size()];
        for(int i=0;i<todos.size();i++){
            Estudante e = todos.get(i);
            array[i] = e.getId()+" "+e.getNome()+" "+e.getMatricula();
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,array);
        lview.setAdapter(adaptador);
    }
}