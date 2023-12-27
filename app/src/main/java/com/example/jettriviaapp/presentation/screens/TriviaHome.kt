package com.example.jettriviaapp.presentation.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jettriviaapp.presentation.component.Questions
import com.example.jettriviaapp.presentation.viewmodel.QuestionsViewModel

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}