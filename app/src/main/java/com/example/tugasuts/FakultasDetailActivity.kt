package com.example.tugasuts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas_layout.*

class FakultasDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas_layout)

        var intentThatStartedThisActivity = getIntent()


        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partNama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDeskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var partListprodi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var partFoto = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER).toInt()
            namaFakultas2.text = partNama
            deskripsiFakultas2.text = partDeskripsi
            listFakultas.text = partListprodi
            fotoFakultas2.setImageResource(partFoto)
        }
    }
}