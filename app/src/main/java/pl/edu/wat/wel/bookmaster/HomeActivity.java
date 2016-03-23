package pl.edu.wat.wel.bookmaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(new MyAdapter());
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView firstLine;
        TextView secondLine;

        public MyViewHolder(View itemView) {
            super(itemView);
            firstLine = (TextView) itemView.findViewById(R.id.first_line);
            secondLine = (TextView) itemView.findViewById(R.id.second_line);
        }
    }

    public static class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        //TODO: odczytać zawartość pliku

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
            MyViewHolder myViewHolder = new MyViewHolder(view);

            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.firstLine.setText("To jest pierwsza linia " + position + "wiersza!");

            //TODO: wpisać w drugą linijkę tekst z pliku
            //holder.secondLine.setText();
        }

        @Override
        public int getItemCount() {
            //TODO: odczytać ilość pozycji
            return 3;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO: obsłużyć menu podręczne

        return super.onOptionsItemSelected(item);
    }
}
