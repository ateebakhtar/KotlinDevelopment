package com.lotus.kotlindevelopment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.workload_item.view.*

class workloadAdapter(mylist:List<String>, var context:Context) : RecyclerView.Adapter<ViewHolder>()
{
    var myList:List<String> = mylist;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.workload_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return myList.count();
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = myList.get(position);
    }


}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val textView = view.item;
}
