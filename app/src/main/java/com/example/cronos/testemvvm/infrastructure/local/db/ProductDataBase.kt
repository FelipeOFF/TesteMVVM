package com.example.cronos.testemvvm.infrastructure.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cronos.testemvvm.infrastructure.local.db.dao.ProductDao
import com.example.cronos.testemvvm.infrastructure.local.db.entity.Product

@Database (
    entities = [
        Product::class
    ],
    version = 1
)
abstract class ProductDataBase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}