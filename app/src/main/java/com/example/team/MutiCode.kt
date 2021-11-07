package com.example.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MutiCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.muti)

        val editTextMutiCode : EditText = findViewById(R.id.editTextMuti)
        val buttonCekMuti : Button = findViewById(R.id.buttonCekMuti)
        val namaAnggota2 = "25"
        val keteranganAnggota : TextView = findViewById(R.id.keteranganMuti)

        buttonCekMuti.setOnClickListener{
            if (editTextMutiCode.length()==0) {
                val toast = Toast.makeText(this, "Silakan input nomor absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextMutiCode.getText().toString()
                if (inputan==namaAnggota2) {
                    val toast = Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
                    toast.show()

                    val detailAnggota = "Halo! Saya Mutia Rani dari kelas XI RPL 1! Kalian bisa panggil aku Muti!"
                    keteranganAnggota.setText(detailAnggota)
                } else {
                    val toast = Toast.makeText(this, "Maaf, nomor absen tidak sesuai", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}