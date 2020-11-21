package com.example.layoutworkout


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumbersAdapter : RecyclerView.Adapter<NumbersAdapter.NumberViewHolder> {
    var numberItems: Int = 0
    var viewHolderCount: Int = 0


    constructor(numberOfItems:Int){
        numberItems = numberOfItems
    }

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var listItemNumberView: TextView = itemView.findViewById(R.id.tv_number_item)
        var viewHolderIndex: TextView = itemView.findViewById(R.id.tv_view_holder_number)


        fun bind(listIndex: Int){
            listItemNumberView.text = listIndex.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var context: Context = parent.context
        var layoutIdForListItem: Int = R.layout.number_list_item

        var inflater: LayoutInflater = LayoutInflater.from(context)

        var view: View = inflater.inflate(layoutIdForListItem,parent,false)

        var viewHolder: NumberViewHolder = NumberViewHolder(view)
        viewHolder.viewHolderIndex.setText("ViewHolder index: "+ viewHolderCount)

        viewHolderCount++

        return viewHolder

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return  numberItems
    }
}