package com.example.todolist

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun addTodo() {
        // Add a To Do item to the list
    }

    @Test
    fun checkmarkTodo(){
        // Check mark a To Do item
    }

    @Test
    fun deleteDoneToDos(){
        // Delete all checkmarked To Do items
    }
}