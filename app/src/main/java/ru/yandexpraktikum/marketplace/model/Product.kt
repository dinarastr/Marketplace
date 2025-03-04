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
            "Smartphone",
            "High-end smartphone with great camera",
            999.99,
            "https://picsum.photos/200"
        ),
        Product(
            2,
            "Laptop",
            "Powerful laptop for work and gaming",
            1499.99,
            "https://picsum.photos/201"
        ),
        Product(
            3,
            "Headphones",
            "Wireless noise-canceling headphones",
            299.99,
            "https://picsum.photos/202"
        ),
        Product(
            4,
            "Smartwatch",
            "Fitness tracking smartwatch",
            199.99,
            "https://picsum.photos/203"
        ),
        Product(
            5,
            "Tablet",
            "Lightweight tablet for entertainment",
            599.99,
            "https://picsum.photos/204"
        ),
        Product(
            6,
            "Camera",
            "Professional DSLR camera",
            1299.99,
            "https://picsum.photos/205"
        )
    )
} 