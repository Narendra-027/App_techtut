package com.group5.techtut

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_tutlist.view.*

class TutListAdapter(val context: Context, val tuts: List<task>): RecyclerView.Adapter<TutListAdapter.TutHolder>() {
    inner class TutHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(tasks: task?, pos: Int) {
            itemView.txvTitle.text = tasks!!.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_tutlist, parent, false)
        return TutHolder(view)
    }

    override fun onBindViewHolder(holder: TutHolder, position: Int) {
        val tasks = tuts[position]
        holder.setData(tasks, position)

    }

    override fun getItemCount(): Int {
        return tuts.size
    }
}