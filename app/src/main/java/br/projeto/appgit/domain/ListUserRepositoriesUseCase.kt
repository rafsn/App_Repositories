package br.projeto.appgit.domain

import br.projeto.appgit.core.UseCase
import br.projeto.appgit.data.model.Repo
import br.projeto.appgit.data.repositories.RepoRepository
import br.projeto.appgit.data.services.GitHubService
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}