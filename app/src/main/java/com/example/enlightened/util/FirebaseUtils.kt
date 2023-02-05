package com.example.enlightened.util
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.FirebaseAuth

object FirebaseUtils {
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser
}