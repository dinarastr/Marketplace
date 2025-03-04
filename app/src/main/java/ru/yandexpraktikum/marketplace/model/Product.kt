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
            "https://picsum.photos/200"
        ),
        Product(
            2,
            "Ноутбук",
            "Мощный ноутбук для работы и учебы",
            1499.99,
            "https://picsum.photos/201"
        ),
        Product(
            3,
            "Наушники",
            "Беспроводные наушники с шумоподавлением",
            299.99,
            "https://picsum.photos/202"
        ),
        Product(
            4,
            "Смарт-часы",
            "Смарт-часы с возможностью измерения пульса",
            199.99,
            "https://picsum.photos/203"
        ),
        Product(
            5,
            "Планшет",
            " Легкий планшет для чтения и просмотра контента",
            599.99,
            "https://picsum.photos/204"
        ),
        Product(
            6,
            "Камера",
            "Профессиональная DSLR камера",
            1299.99,
            "https://picsum.photos/205"
        )
    )
} 