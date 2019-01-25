package com.human.tools.myquotes.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.human.tools.myquotes.R
import com.human.tools.myquotes.item.DaggerItemComponent
import com.human.tools.myquotes.item.ItemContract
import com.human.tools.myquotes.item.ItemModel
import javax.inject.Inject

class QuoteAdapter @Inject constructor() : RecyclerView.Adapter<QuoteHolder>() {

    private lateinit var data: List<ItemModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.quote_layout, parent, false)
        val presenter = DaggerItemComponent.builder().setView(view).build().getPresenter()
        return QuoteHolder(presenter = presenter, view = view)
    }

    override fun getItemCount() = data.size


    override fun onBindViewHolder(holder: QuoteHolder, position: Int) {
        holder.presenter.bindData(data[position])
    }

    fun setData(data: List<ItemModel>) {
        this.data = data
        notifyDataSetChanged()
    }

}

class QuoteHolder(
    val presenter: ItemContract.Presenter,
    val view: View
) : RecyclerView.ViewHolder(view) {

}