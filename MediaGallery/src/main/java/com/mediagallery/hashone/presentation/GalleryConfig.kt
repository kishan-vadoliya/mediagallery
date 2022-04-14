package com.mediagallery.hashone.presentation

import android.graphics.Color
import android.os.Parcelable
import com.mediagallery.hashone.util.KeyUtils
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GalleryConfig(
    var toolbarColor: Int = Color.BLACK,
    var statusBarColor: Int = Color.BLACK,
    var toolbarResourceColor: Int = Color.WHITE,
    var progressBarColor: Int = Color.BLACK,
    var selectedMedias: ArrayList<String> = ArrayList(),
    var mediaType: MediaType = MediaType.IMAGE,
    var maxCount: Int = KeyUtils.DEFAULT_MEDIA_COUNT,
    var gridSize: Int = KeyUtils.DEFAULT_GRID_SIZE,
    var minTime: Long = KeyUtils.DEFAULT_DURATION,
    var maxTime: Long = KeyUtils.DEFAULT_DURATION,
    var supportedFileType: MutableList<String> = mutableListOf(),
    var isCrop: Boolean = false
) : Parcelable {
    companion object {

        private var mediaPickerConfig = GalleryConfig()

        fun setConfig(lassiConfig: GalleryConfig) {
            mediaPickerConfig.apply {
                toolbarColor = lassiConfig.toolbarColor
                statusBarColor = lassiConfig.statusBarColor
                toolbarResourceColor = lassiConfig.toolbarResourceColor
                progressBarColor = lassiConfig.progressBarColor
                selectedMedias = lassiConfig.selectedMedias
                mediaType = lassiConfig.mediaType
                maxCount = lassiConfig.maxCount
                gridSize = lassiConfig.gridSize
                minTime = lassiConfig.minTime
                maxTime = lassiConfig.maxTime
                supportedFileType = lassiConfig.supportedFileType
                isCrop = lassiConfig.isCrop
            }
        }

        fun getConfig(): GalleryConfig {
            return mediaPickerConfig
        }

        fun isSingleMediaSelection(): Boolean {
            return (mediaPickerConfig.maxCount == 1)
        }
    }
}