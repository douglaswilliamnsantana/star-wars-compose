package com.douglassantana.star_wars_compose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.douglassantana.star_wars_compose.domain.model.StarWarsFilmsItemModel

@Composable
fun StarWarsScreen(
    viewModel: StarWarsViewModel
) {

    viewModel.getStarWarsFilms()

    val uiState by viewModel.uiState.collectAsState()

    StarWars(elements = uiState.results ?: listOf())

}

@Composable
fun StarWars(elements: List<StarWarsFilmsItemModel>) {
    LazyColumn {
        items(elements) { element ->
            StarWarsElement(element.title)
        }
    }
}

@Composable
fun StarWarsElement(title: String) {
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = title,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewStarWars() {
    StarWarsElement("Android")
}