package com.mediagallery.hashone.gallery.config.builder

import android.content.Context
import android.content.Intent
import com.mediagallery.hashone.gallery.MediaActivity
import com.mediagallery.hashone.gallery.config.GalleryConfig
import com.mediagallery.hashone.gallery.model.MediaType
import com.mediagallery.hashone.gallery.utils.MediaConstant


class OpenGallery(private val context: Context) {

    private var lassiConfig = GalleryConfig()

    /**
     * Limit max item selection
     */
    fun setMaxCount(maxCount: Int): OpenGallery {
        // handle negative input
        lassiConfig.maxCount = if (maxCount < 0) {
            MediaConstant.DEFAULT_MEDIA_COUNT
        } else {
            maxCount
        }
        return this
    }

    /**
     * Set item grid size (>= 2 or <=4)
     */
    /*  fun setGridSize(gridSize: Int): OpenGallery {
          lassiConfig.gridSize = when {
              gridSize < KeyUtils.DEFAULT_GRID_SIZE -> KeyUtils.DEFAULT_GRID_SIZE
              gridSize > KeyUtils.MAX_GRID_SIZE -> KeyUtils.MAX_GRID_SIZE
              else -> gridSize
          }
          return this
      }*/

    /**
     * Media type (MediaType.IMAGE, MediaType.VIDEO, MediaType.AUDIO, MediaType.DOC)
     */
    fun setMediaType(mediaType: MediaType): OpenGallery {
        lassiConfig.mediaType = mediaType
        return this
    }

    /**
     * Set toolbar color resource
     */
    /*  fun setToolbarColor(@ColorRes toolbarColor: Int): OpenGallery {
          lassiConfig.toolbarColor = ContextCompat.getColor(context, toolbarColor)
          return this
      }*/

    /**
     * Set toolbar color hex
     */
    /*fun setToolbarColor(toolbarColor: String): OpenGallery {
        lassiConfig.toolbarColor = Color.parseColor(toolbarColor)
        return this
    }*/

    /**
     * Set statusBar color resource (Only applicable for >= Lollipop)
     */
    /* fun setStatusBarColor(@ColorRes statusBarColor: Int): OpenGallery {
         lassiConfig.statusBarColor = ContextCompat.getColor(context, statusBarColor)
         return this
     }*/

    /**
     * Set statusBar color hex (Only applicable for >= Lollipop)
     */
    /* fun setStatusBarColor(statusBarColor: String): OpenGallery {
         lassiConfig.statusBarColor = Color.parseColor(statusBarColor)
         return this
     }*/

    /**
     * Set toolbar color resource
     */
    /*fun setToolbarResourceColor(@ColorRes toolbarResourceColor: Int): OpenGallery {
        lassiConfig.toolbarResourceColor = ContextCompat.getColor(context, toolbarResourceColor)
        return this
    }*/

    /**
     * Set toolbar color hex
     */
    /*  fun setToolbarResourceColor(toolbarResourceColor: String): OpenGallery {
          lassiConfig.toolbarResourceColor = Color.parseColor(toolbarResourceColor)
          return this
      }*/

    /**
     * Set progressbar color resource
     */
    /* fun setProgressBarColor(@ColorRes progressBarColor: Int): OpenGallery {
         lassiConfig.progressBarColor = ContextCompat.getColor(context, progressBarColor)
         return this
     }*/

    /**
     * Set progressbar color hex
     */
    /* fun setProgressBarColor(progressBarColor: String): OpenGallery {
         lassiConfig.progressBarColor = Color.parseColor(progressBarColor)
         return this
     }*/

    /**
     * Set crop (only for MediaType.Image and Single Image Selection)
     */
    /*  fun enableCrop(): OpenGallery {
          lassiConfig.isCrop = true
          return this
      }*/

    /**
     * Set Font
     */
    fun setFontResource(resource: Int): OpenGallery {
        lassiConfig.fontResource = resource
        return this
    }

    /**
     * Set Done Text
     */
    fun setDoneText(doneString: String): OpenGallery {
        lassiConfig.doneText = doneString
        return this
    }

    /**
     * Set Loading Text
     */
    fun setLoadingText(loadingString: String): OpenGallery {
        lassiConfig.loadingText = loadingString
        return this
    }

    /**
     * Set Font
     */
    fun setBannerAdsId(admobId: String): OpenGallery {
        lassiConfig.admobId = admobId
        return this
    }

    /**
     * Create intent for LassiMediaPickerActivity with config
     */
    fun build(): Intent {
        GalleryConfig.setConfig(lassiConfig)
        return Intent(context, MediaActivity::class.java)
    }
}
