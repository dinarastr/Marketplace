package ru.yandexpraktikum.marketplace.navigation

sealed class Screen(val route: String) {
    data object ProductList : Screen("productList")
    data object ProductDetail : Screen("productDetail/{productId}") {
        fun createRoute(productId: Int) = "productDetail/$productId"
    }
}