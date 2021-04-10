package com.example.buton


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem (1).isEnabled=false



//        bottomNavigationView.setOnNavigationItemSelectedListener{
//            when (it.itemId){
//                R.id.miMap -> startActivity(Intent(Harta_1))
//                R.id.miMap-> setOnClickListener({startActivity(Intent(this, Harta_1::class.java)) })
//                else ->  startActivity(MainActivity)
//            }
//            true
//        }



//        class CustomViewHolder(val view: View): RecyclerView.ViewHolder (view){
//             init{
//                  view.setOnClickListener{
//                      val intent =Intent(view.context, Harta_1:class.java)
//                      view.context.startActivity(intent)
//                  }
//             }
//        }


        miMap.setOnClickListener({startActivity(Intent(this, Harta_1::class.java)) })
//        bottomNavigationView.menu.getItem(0).setOnMenuItemClickListener({startActivity(Intent(this, Harta_1::class.java))})


//        @Override
//        public boolean onOptionsItemSelected()
//        bottomNavigationView.menu.getItem (0).setOnClickListener
//        setOnClickListener({startActivity(Intent(this, Harta_1::class.java)) }
    }
}