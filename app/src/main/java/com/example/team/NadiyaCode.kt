package com.example.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NadiyaCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nadiya)
        val editTextNadiyaCode : EditText = findViewById(R.id.editTextNadiya)
        val buttonCekNadiya : Button = findViewById(R.id.buttonCekNadiya)
        val namaAnggota1 = "26"
        val keteranganAnggota : TextView = findViewById(R.id.keteranganNadiya)

        buttonCekNadiya.setOnClickListener{
            if (editTextNadiyaCode.length()==0) {
                val toast = Toast.makeText(this, "Silakan input nomor absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextNadiyaCode.getText().toString()
                if (inputan==namaAnggota1) {
                    val toast = Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
                    toast.show()

                    val detailAnggota = "Halo! Saya Nadiya Salsabila dari kelas XI RPL 1! Kalian bisa panggil aku Nadiya!"
                    keteranganAnggota.setText(detailAnggota)
                } else {
                    val toast = Toast.makeText(this, "Maaf, nomor absen tidak sesuai", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}