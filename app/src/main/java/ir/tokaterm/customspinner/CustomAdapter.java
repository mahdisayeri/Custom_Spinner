package ir.tokaterm.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] flag;
    String[] name;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] flag, String[] name) {
        this.context = context;
        this.flag = flag;
        this.name = name;
        layoutInflater = layoutInflater.from(context) ;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=layoutInflater.inflate(R.layout.item_custom_spinner,null);
        ImageView img=convertView.findViewById(R.id.spinner_imageView);
        TextView txt=convertView.findViewById(R.id.spinner_textView);

        img.setImageResource(flag[position]);
        txt.setText(name[position]);

        return convertView;
    }
}
