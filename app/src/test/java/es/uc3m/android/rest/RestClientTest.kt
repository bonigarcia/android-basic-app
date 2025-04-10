/*
 * (C) Copyright 2025 Boni Garcia (https://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package es.uc3m.android.rest

import es.uc3m.android.rest.dummyjson.DummyJsonClient
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertTrue
import org.junit.Test

class RestClientTest {

    @Test
    fun dummyJsonTest() = runTest {
        // Exercise
        val response = DummyJsonClient.apiService.getTodos()

        // Verify
        assertTrue(response.isSuccessful)
        var todos = response.body()?.todos!!
        println(">>> todos: $todos")
        assertTrue(todos.isNotEmpty())
    }
}