package com.henriette.bill.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import com.henriette.bill.R
import com.henriette.bill.databinding.ActivityAddBillBinding
import com.henriette.bill.databinding.FragmentSummaryBinding
import com.henriette.bill.viewmodel.BillsViewModel
import java.util.UUID

class AddBillActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddBillBinding
    val billsViewModel:BillsViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBillBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setupFreqSpinner()
        setupDueDateSpinner()


    }
    fun setupFreqSpinner(){
        val adapter = ArrayAdapter
            .createFromResource(this, R.array.frequencies, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spFrequency.adapter = adapter
    }
    fun setupDueDateSpinner(){
        val weeklyAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOf(1,2,3,4,5,6,7))
        weeklyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        binding.spDueDate.adapter=weeklyAdapter
//
//        val billId = UUID.randomUUID().toString()
    }
}