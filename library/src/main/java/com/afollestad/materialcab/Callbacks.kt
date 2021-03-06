package com.afollestad.materialcab

import android.view.Menu
import android.view.MenuItem

typealias CreateCallback = (cab: MaterialCab, menu: Menu) -> Unit

typealias SelectCallback = (item: MenuItem) -> Boolean

typealias DestroyCallback = (cab: MaterialCab) -> Boolean