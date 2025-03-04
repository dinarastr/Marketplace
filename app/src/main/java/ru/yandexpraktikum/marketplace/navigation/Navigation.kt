package ru.yandexpraktikum.marketplace.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.yandexpraktikum.marketplace.ui.screens.DetailScreen
import ru.yandexpraktikum.marketplace.ui.screens.MainScreen

@Composable
fun MarketplaceNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.ProductList.route) {
        composable(Screen.ProductList.route) {
            MainScreen(
                onProductClick = { productId ->
                    navController.navigate(Screen.ProductDetail.createRoute(productId))
                }
            )
        }
        composable(
            route = Screen.ProductDetail.route,
            arguments = listOf(
                navArgument("productId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: return@composable
            DetailScreen(
                productId = productId,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}

