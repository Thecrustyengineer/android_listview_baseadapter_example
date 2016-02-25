package com.thecrustyengineer.listviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thecrustyengineer.listviewexample.Object.Letter;
import com.thecrustyengineer.listviewexample.R;

import java.util.List;

public class BaseAdapterAlphabet extends BaseAdapter{

    private List<Letter> list;
    private LayoutInflater layoutInflater;

    public BaseAdapterAlphabet(List<Letter> list, Context context){
        this.list = list;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if(view == null){
            view = layoutInflater.inflate(R.layout.listview_alphabet_item, viewGroup, false);

            viewHolder = new ViewHolder();
            viewHolder.textViewLetter = (TextView)view.findViewById(R.id.listview_alphabet_item_textView_letter);
            viewHolder.textViewWord = (TextView)view.findViewById(R.id.listview_alphabet_item_textView_word);
            viewHolder.textViewLetter.setText(list.get(position).LETTER);
            viewHolder.textViewWord.setText(list.get(position).WORD);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)view.getTag();
            viewHolder.textViewLetter.setText(list.get(position).LETTER);
            viewHolder.textViewWord.setText(list.get(position).WORD);
        }

        return view;
    }

    static class ViewHolder{
        TextView textViewLetter;
        TextView textViewWord;
    }
}
