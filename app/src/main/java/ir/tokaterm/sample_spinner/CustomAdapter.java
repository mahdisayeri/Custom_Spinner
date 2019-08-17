package ir.tokaterm.sample_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] imgRes;
    String[] textName;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] imgRes, String[] textName) {
        this.context = context;
        this.imgRes = imgRes;
        this.textName = textName;
        layoutInflater = layoutInflater.from(context) ;
    }

    @Override
    public int getCount() {
        return textName.length;
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

        img.setImageResource(imgRes[position]);
        txt.setText(textName[position]);

        return convertView;
    }
}
