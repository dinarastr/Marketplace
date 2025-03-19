package ru.yandexpraktikum.marketplace.model

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String
)

// Sample data for testing
object SampleProducts {
    val products = listOf(
        Product(
            1,
            "Телефон",
            "Телефон с отличной камерой и быстрой зарядкой",
            999.99,
            "https://cdn.pixabay.com/photo/2020/09/02/03/26/iphone-5537230_1280.jpg"
        ),
        Product(
            2,
            "Ноутбук",
            "Мощный ноутбук для работы и учебы",
            1499.99,
            "https://cdn.pixabay.com/photo/2016/03/27/07/12/apple-1282241_1280.jpg"
        ),
        Product(
            3,
            "Наушники",
            "Беспроводные наушники с шумоподавлением",
            299.99,
            "https://cdn.pixabay.com/photo/2017/08/14/16/15/earphone-2640990_1280.jpg"
        ),
        Product(
            4,
            "Смарт-часы",
            "Смарт-часы с возможностью измерения пульса",
            199.99,
            "https://cdn.pixabay.com/photo/2015/06/25/17/23/smart-watch-821567_1280.jpg"
        ),
        Product(
            5,
            "Планшет",
            " Легкий планшет для чтения и просмотра контента",
            599.99,
            "https://cdn.pixabay.com/photo/2013/09/22/09/15/tablet-184888_1280.jpg"
        ),
        Product(
            6,
            "Камера",
            "Профессиональная DSLR камера",
            1299.99,
            "https://cdn.pixabay.com/photo/2014/08/29/14/53/camera-431119_1280.jpg"
        )
    )
} 