package com.projeto.playstore

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Inicial() {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { BarraTopo() }

    ) { innerPadding ->
        Surface (
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ){
            Column(

            ) {
            Card(
                colors = CardDefaults.cardColors(Color.Cyan),
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                border = BorderStroke(2.dp, Color.Black)

            ) {  }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                )
                     {
                    Text("Patrocinados • ", style = MaterialTheme.typography.bodyMedium)
                    Text("Sugestões para você", style = MaterialTheme.typography.bodyLarge)

                    Spacer(modifier = Modifier.width(74.dp))

                         Icon(
                             imageVector = Icons.Default.MoreVert,
                             contentDescription = "",
                             modifier = Modifier.size(30.dp)
                         )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Aplicativo(Color.Red)

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        Text("iFood para Entregadores")

                        Spacer(modifier = Modifier.height(5.dp))

                        Text("Empresa • Economia gig • Empregos e carreira", style = MaterialTheme.typography.bodySmall)

                        Spacer(modifier = Modifier.height(5.dp))

                        Row(

                        ) {
                            Text("4,6", style = MaterialTheme.typography.bodySmall)

                            Spacer(modifier = Modifier.width(2.dp))

                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "",
                                modifier = Modifier.size(14.dp),
                                tint = Color.Black
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Text("43 MB")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Aplicativo(Color.Black)

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        Text("SHEIN-COMPRAS Online")

                        Spacer(modifier = Modifier.height(5.dp))

                        Text("Compras • Lojas", style = MaterialTheme.typography.bodySmall)

                        Spacer(modifier = Modifier.height(5.dp))

                        Row(

                        ) {
                            Text("4,1", style = MaterialTheme.typography.bodySmall)

                            Spacer(modifier = Modifier.width(2.dp))

                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "",
                                modifier = Modifier.size(14.dp),
                                tint = Color.Black
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Text("27 MB")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Aplicativo(Color.Green)

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        Text("PicPay: Conta, Cartão e Pix")

                        Spacer(modifier = Modifier.height(5.dp))

                        Text("PicPay • Finanças • Carteiras digitais", style = MaterialTheme.typography.bodySmall)

                        Spacer(modifier = Modifier.height(5.dp))

                        Row(

                        ) {
                            Text("4,7", style = MaterialTheme.typography.bodySmall)

                            Spacer(modifier = Modifier.width(2.dp))

                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "",
                                modifier = Modifier.size(14.dp),
                                tint = Color.Black
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Text("156 MB")
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Navegacao(){

    TopAppBar(
        modifier = Modifier.padding(5.dp),
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "",
                modifier = Modifier.size(45.dp)
            )
        },
        title = { Text("") },
        actions = {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "",
                modifier = Modifier.size(30.dp)
            )

            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "",
                modifier = Modifier.size(50.dp)
            )
        }
    )

}



