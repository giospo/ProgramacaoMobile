package com.example.copa

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.copa.model.ArabiaEscalacao

class EscalacaoAdapter(
    private val context: Context,
    private val dataset: List<ArabiaEscalacao>,
) : RecyclerView.Adapter<EscalacaoAdapter.EscalacaoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EscalacaoViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return EscalacaoViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: EscalacaoViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.button.text = context.resources.getString(item.stringResourceId)

        val context = holder.view.context

        holder.button.setOnClickListener {
            val queryUrl: Uri =
                Uri.parse("${DetailActivity.SEARCH_PREFIX}${holder.button.text}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class EscalacaoViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.button_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val button: Button = view.findViewById(R.id.button_title)
    }
}