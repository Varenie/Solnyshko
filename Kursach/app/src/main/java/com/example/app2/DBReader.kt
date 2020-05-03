package com.example.app2

import android.provider.BaseColumns

object DBReader {
    object UserTable: BaseColumns{
        const val TABLE_NAME = "Users"
        const val COLUMN_ID = "user_id"
        const val COLUMN_LOGIN = "login"
        const val COLUMN_NAME = "name"
        const val COLUMN_PASSWORD = "password"
        const val COLUMN_POINTS = "points"
        const val COLUMN_REMEMBER = "remember"
    }

    object OrderTable: BaseColumns{
        const val TABLE_NAME = "Orders"
        const val COLUMN_ID = "order_id"
        const val COLUMN_USER_ID = "user_id"
        const val COLUMN_NUMBER = "order_number"
        const val COLUMN_COST = "cost"
    }

    object UserOrderTable: BaseColumns{
        const val TABLE_NAME = "User_order"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_PRICE = "price"
    }

    object MenuTable: BaseColumns {
        const val TABLE_NAME = "Menu"
        const val COLUMN_ID = "food_id"
        const val COLUMN_GROUP_ID = "id_group"
        const val COLUMN_NAME = "name"
        const val COLUMN_DESCRIPTION = "description"
        const val COLUMN_PRICE = "price"
    }

    object MenuSingleton{
        const val FOOD_NAME = "food_names"
        const val FOOD_DESCRIPTION = "food_descriptions"
        const val FOOD_PRICE = "price"
    }
}