package com.example.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class JordanCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jordan)

        val editTextJordanCode : EditText = findViewById(R.id.editTextJordan)
        val buttonCekJordan : Button = findViewById(R.id.buttonCekJordan)
        val namaAnggota1 = "20"
        val keteranganAnggota : TextView = findViewById(R.id.keteranganJordan)

        buttonCekJordan.setOnClickListener{
            if (editTextJordanCode.length()==0) {
                val toast = Toast.makeText(this, "Silakan input nomor absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextJordanCode.getText().toString()
                if (inputan==namaAnggota1) {
                    val toast = Toast.makeText(this, "Success!", Toast.LENGTH_SHORT)
                    toast.show()

                    val detailAnggota = "Jordan Angkawijaya adalah nama lengkapnya & XI RPL 1 adalah kelasnya. Dia lahir di Batam & sekarang tinggal di Purwokerto."
                    keteranganAnggota.setText(detailAnggota)
                } else {
                    val toast = Toast.makeText(this, "Maaf, nomor absen tidak sesuai", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}