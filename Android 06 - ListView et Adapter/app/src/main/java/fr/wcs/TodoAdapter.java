package fr.wcs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {

    public TodoAdapter(Context context, List<Todo> todo) {
        super(context, 0, todo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Todo item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_todo, parent, false);
        }

        TextView textDescription = convertView.findViewById(R.id.textDescription);
        TextView textDate = convertView.findViewById(R.id.textDate);

        textDescription.setText(item.getDescription());
        String day = "" + item.getDate().getDay();
        if (day.length() < 2) {
            day = "0" + day;
        }
        String month = "" + item.getDate().getMonth();
        if (month.length() < 2) {
            month = "0" + month;
        }
        textDate.setText(day + "/" + month + "/" + item.getDate().getYear());

        return convertView;
    }
}