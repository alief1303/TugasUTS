package com.example.tugasuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFakultasData()
        fakultasParts.layoutManager = LinearLayoutManager(this)
        fakultasParts.setHasFixedSize(true)
        fakultasParts.adapter = FakultasAdapter(testData, { fakultasItem: FakultasData -> fakultasItemClicked(fakultasItem)})
    }

    private fun fakultasItemClicked(fakultasItem: FakultasData) {
        val showDetailActivityIntent = Intent(this, FakultasDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakultasItem.namaFakultas.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakultasItem.deskripsiFakultas.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, fakultasItem.listProdi.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, fakultasItem.fotoFakultas.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createFakultasData() : List<FakultasData> {
        val partList = ArrayList<FakultasData>()
        partList.add(FakultasData("Fakultas Ilmu Komputer", "1. Sistem Informasi\n2. Teknik Informatika", "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n ", R.drawable.upn))
        partList.add(FakultasData("Fakultas Teknik\n", "1. Teknik Kimia\n2. Teknik Industri\n3. Teknik Pangan\n4. Teknik Lingkungan\n5. Teknik Sipil", "Fakultas", R.drawable.upn))
        partList.add(FakultasData("Fakultas Ekonomi dan Bisnis\n", "1. Ekonomi Pembangunan\n2. Manajemen\n3. Akuntansi", "Fakultas", R.drawable.upn))
        partList.add(FakultasData("Fakultas  Pertanian\n", "1. Agroteknologi\n2. Agribisnis", "Fakultas", R.drawable.upn))
        partList.add(FakultasData("Muhammad Dian Nur Alief\n", "1. Tempat, Tanggal Lahir: Denpasar, 13 Maret 2000\n2. Alamat: perum.Gria UmaSari No.10\n3. No.HP: 081329549737\n4. Email: alieflalala21@gmail.com\n5. Url Github: https://github.com/alief1303\n6. Riwayat Pendidikan: \n\t SD: MI Al-Ma'ruf\n\t SMP: SMP Al-Firdaus Boarding School \n\t SMA: MBI Amanatul Ummah\n7. Penghargaan: - ", "", R.drawable.w))
        return partList

    }
}

