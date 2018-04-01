package org.mightyfrog.android.recyclerviewfastscrollsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Shigehiro Soejima
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = MyAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

        override fun getItemCount() = 100

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false))
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.textView.text = position.toString()
        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.textView)
    }
}
