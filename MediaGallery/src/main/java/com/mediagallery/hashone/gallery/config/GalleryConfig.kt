package com.mediagallery.hashone.gallery.config

import android.graphics.Color
import android.os.Parcelable
import com.mediagallery.hashone.gallery.model.MediaType
import com.mediagallery.hashone.gallery.utils.MediaConstant
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GalleryConfig(
    var toolbarColor: Int = Color.BLACK,
    var statusBarColor: Int = Color.BLACK,
    var toolbarResourceColor: Int = Color.WHITE,
    var progressBarColor: Int = Color.BLACK,
    var selectedMedias: ArrayList<String> = ArrayList(),
    var mediaType: MediaType = MediaType.IMAGE,
    var maxCount: Int = MediaConstant.DEFAULT_MEDIA_COUNT,
    var gridSize: Int = MediaConstant.DEFAULT_GRID_SIZE,
    var minTime: Long = MediaConstant.DEFAULT_DURATION,
    var maxTime: Long = MediaConstant.DEFAULT_DURATION,
    var supportedFileType: MutableList<String> = mutableListOf(),
    var isCrop: Boolean = false,
    var fontFamilyName: String = "Tinos-Bold.ttf",
    var fontResource: Int = -1,
    var doneText: String = "",
    var loadingText: String = "",
    var admobId: String = ""
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
                fontFamilyName = lassiConfig.fontFamilyName
                fontResource = lassiConfig.fontResource
                admobId = lassiConfig.admobId
                doneText = lassiConfig.doneText
                loadingText = lassiConfig.loadingText
            }
        }

        fun getConfig(): GalleryConfig {
            return mediaPickerConfig
        }
    }
}
