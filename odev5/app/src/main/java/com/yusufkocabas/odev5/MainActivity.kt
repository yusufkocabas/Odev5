package com.yusufkocabas.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusufkocabas.odev5.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sayiStringi=""
        var integersayim=0
        var toplamsayim = 0

        binding.buttonTopla.setOnClickListener {



            if(sayiStringi!=""){
                integersayim =  sayiStringi.toInt()
                toplamsayim = toplamsayim + integersayim
                sayiStringi=""
            }else{
                val snackbar = Snackbar.make(binding.root,"Dikkat! Sayı Girmeyi Unutmayınız",Snackbar.LENGTH_LONG).show()
            }



        }
        binding.buttonSifir.setOnClickListener {
            sayiStringi +="0"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonBir.setOnClickListener {
            sayiStringi +="1"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonIki.setOnClickListener {
            sayiStringi +="2"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonUc.setOnClickListener {
            sayiStringi +="3"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonDort.setOnClickListener {
            sayiStringi +="4"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonBes.setOnClickListener {
            sayiStringi +="5"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonAlti.setOnClickListener {
            sayiStringi +="6"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonYedi.setOnClickListener {
            sayiStringi +="7"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonSekiz.setOnClickListener {
            sayiStringi +="8"
            binding.textView.text = sayiStringi.toString()
        }
        binding.buttonDokuz.setOnClickListener {
            sayiStringi +="9"
            binding.textView.text = sayiStringi.toString()
        }

        binding.buttonEsittir.setOnClickListener {
            integersayim =  sayiStringi.toInt()
            toplamsayim = toplamsayim + integersayim
            binding.textView.text = toplamsayim.toString()
        }
        binding.buttonTemizle.setOnClickListener {
            binding.textView.text = ""
            toplamsayim = 0
            sayiStringi=""

        }





    }
}