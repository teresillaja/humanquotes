package com.human.tools.myquotes.home

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.human.tools.myquotes.R
import com.human.tools.myquotes.item.ItemModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.View {

//    @Inject
//    lateinit var presenter: MainActivityContract.Presenter

    override fun setData(data: List<ItemModel>) {
        adapter.setData(data)
    }

    private val adapter = QuoteAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)

        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = adapter

//        adapter.setData(
//            listOf(
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("hello", "world"),
//                ItemModel("adios", "world"),
//                ItemModel("hello", "world")
//            )
//        )


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
