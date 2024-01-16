package com.base.androidstartertemplate.presentation.modules.home.screens.navScreens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.base.androidstartertemplate.presentation.modules.home.screens.HomeScreen
import com.base.androidstartertemplate.presentation.modules.home.screens.ListScreen
import com.base.androidstartertemplate.presentation.modules.home.screens.ProfileScreen
import com.base.androidstartertemplate.presentation.modules.home.screens.SearchScreen
import com.base.androidstartertemplate.presentation.navigation.NavItem

/**
 * Composable function that defines the navigation screens and their corresponding destinations.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@Composable
fun NavigationScreens(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Home.route) {
        composable(NavItem.Home.route) { HomeScreen() }
        composable(NavItem.Search.route) { SearchScreen() }
        composable(NavItem.List.route) { ListScreen() }
        composable(NavItem.Profile.route) { ProfileScreen() }
    }
}