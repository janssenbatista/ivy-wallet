package com.ivy.data.di

import com.ivy.data.repository.AccountRepository
import com.ivy.data.repository.CategoryRepository
import com.ivy.data.repository.TransactionRepository
import com.ivy.data.repository.impl.AccountRepositoryImpl
import com.ivy.data.repository.impl.CategoryRepositoryImpl
import com.ivy.data.repository.impl.TransactionRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryBindingsModule {
    @Binds
    abstract fun bindAccountRepo(repo: AccountRepositoryImpl): AccountRepository

    @Binds
    abstract fun bindCategoryRepo(repo: CategoryRepositoryImpl): CategoryRepository

    @Binds
    abstract fun bindTransactionRepo(repo: TransactionRepositoryImpl): TransactionRepository
}
