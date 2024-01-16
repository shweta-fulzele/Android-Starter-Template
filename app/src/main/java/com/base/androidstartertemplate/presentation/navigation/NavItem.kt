package com.base.androidstartertemplate.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

open class NavItems(val route: String, val title: String, val icon: ImageVector)
sealed class NavItem {
    object Home :
        NavItems(route = NavRoutes.HOME.toString(), title = NavTitle.HOME, icon = Icons.Default.Home)

    object Search :
        NavItems(route = NavRoutes.SEARCH.toString(), title = NavTitle.SEARCH, icon = Icons.Default.Search)

    object List :
        NavItems(route = NavRoutes.LIST.toString(), title = NavTitle.LIST, icon = Icons.Default.List)

    object Profile :
        NavItems(
            route = NavRoutes.PROFILE.toString(), title = NavTitle.PROFILE, icon = Icons.Default.Person)
}