package com.unsplash.pickerandroid.photopicker.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashUser(
    val id: String,
    val username: String,
    val name: String,
    val portfolio_url: String?,
    val bio: String?,
    val location: String?,
    val total_likes: Int = 0,
    val total_photos: Int = 0,
    val total_collection: Int = 0,
    val profile_image: UnsplashUrls,
    val links: UnsplashLinks
) : Parcelable
