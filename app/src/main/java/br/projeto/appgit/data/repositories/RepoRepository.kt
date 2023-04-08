package br.projeto.appgit.data.repositories

import br.projeto.appgit.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories (user: String) : Flow<List<Repo>>
}