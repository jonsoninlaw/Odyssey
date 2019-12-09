package fr.wcs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Todo cat = new Todo("Nourrir le chat", new Date(2019, 10, 18));
        Todo codewars = new Todo("Arrêter de tricher à Codewars", new Date(2021, 01, 01));
        Todo car = new Todo("Réparer la voiture", new Date(2019, 9, 6));

        List<Todo> todo = Arrays.asList(cat, codewars, car);

        ListView todoList = findViewById(R.id.todoList);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todo);
        todoList.setAdapter(adapter);


    }
}
