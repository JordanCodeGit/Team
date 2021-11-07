package com.example.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AxelCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.axel)

        val editTextAxelCode : EditText = findViewById(R.id.editTextAxel)
        val buttonCekAxel : Button = findViewById(R.id.buttonCekAxel)
        val namaAnggota1 = "8"
        val keteranganAnggota : TextView = findViewById(R.id.keteranganAxel)

        buttonCekAxel.setOnClickListener{
            if (editTextAxelCode.length()==0) {
                val toast = Toast.makeText(this, "Silakan input nomor absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextAxelCode.getText().toString()
                if (inputan==namaAnggota1) {
                    val toast = Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
                    toast.show()
                    val detailAnggota = "Halo! Saya Axel Davin dari kelas XI RPL 1! Kalian bisa panggil aku Axel!"
                    keteranganAnggota.setText(detailAnggota)
                } else {
                    val toast = Toast.makeText(this, "Maaf, nomor absen tidak sesuai", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}