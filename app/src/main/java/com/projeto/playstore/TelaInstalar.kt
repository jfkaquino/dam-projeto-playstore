package com.projeto.playstore

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.SportsEsports
import androidx.compose.material.icons.rounded.GetApp
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun TelaInstalar() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { BarraSuperior() },
        bottomBar = { BarraInferior() },
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 10.dp)
            ) {
                Row {
                    Surface(
                        modifier = Modifier.size(80.dp),
                        color = Color.Blue,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Phone,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            "Telefone",
                            style = MaterialTheme.typography.headlineMedium
                        )
                        Text(
                            "Google LLC",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Blue
                        )
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 15.dp, vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "4,3",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.labelSmall
                        )
                        Text(
                            "26 mi\navaliações",
                            textAlign = TextAlign.Center,
                            color = Color.DarkGray,
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 15.dp, vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.GetApp,
                            contentDescription = ""
                        )
                        Text(
                            "8,8 MB",
                            textAlign = TextAlign.Center,
                            color = Color.DarkGray,
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 15.dp, vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "Mais de 10 bi",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.labelSmall
                        )
                        Text(
                            "Downloads",
                            textAlign = TextAlign.Center,
                            color = Color.DarkGray,
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                }
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    colors = ButtonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Black
                    ),
                    onClick = {},
                ) {
                    Text(
                        "Instalar",
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    CapturaDeTela()
                    CapturaDeTela()
                    CapturaDeTela()
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        "Sobre este app",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .size(20.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.LightGray),
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                            contentDescription = ""
                        )
                    }
                }
                Text(
                    "Ligações confiáveis com proteção contra spam, identificador de chamadas e outros",
                    modifier = Modifier
                        .padding(15.dp, 0.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(30.dp))
                FlowRow(
                    Modifier
                        .height(70.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        "Ferramentas",
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.LightGray), RoundedCornerShape(5.dp))
                            .padding(8.dp, 5.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text(
                        "Comunicação",
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.LightGray), RoundedCornerShape(5.dp))
                            .padding(8.dp, 5.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text(
                        "Apps de chamadas",
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.LightGray), RoundedCornerShape(5.dp))
                            .padding(8.dp, 5.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text(
                        "Android Auto",
                        modifier = Modifier
                            .border(BorderStroke(1.dp, Color.LightGray), RoundedCornerShape(5.dp))
                            .padding(8.dp, 5.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior() {
    TopAppBar(
        modifier = Modifier.padding(5.dp),
        navigationIcon = {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(30.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .fillMaxSize(),
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                    contentDescription = "",
                )
            }
        },
        title = { Text("") },
        actions = {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(30.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .fillMaxSize(),
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = "",
                )
            }
        }
    )
}

@Composable
fun BarraInferior() {
    BottomAppBar{
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(30.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Outlined.SportsEsports,
                        contentDescription = "",
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Jogos",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(30.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Outlined.GridView,
                        contentDescription = "",
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Apps",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(30.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Outlined.Search,
                        contentDescription = "",
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Pesquisa",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(30.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        imageVector = Icons.Outlined.Book,
                        contentDescription = "",
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Livros",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun CapturaDeTela() {
    Surface(
        modifier = Modifier
            .width(100.dp)
            .height(170.dp),
        color = Color.LightGray,
        shape = RoundedCornerShape(10.dp)
    ){}
}