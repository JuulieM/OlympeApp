package com.example.olympeapp.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.olympeapp.R
import kotlinx.android.synthetic.main.training_card.view.*

/**
 *
 * @author yanngodeau on 28/02/2019
 */
class TrainingCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.training_card, this, true)
        orientation = VERTICAL

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.TrainingCard, 0, 0)

            val title: CharSequence = resources.getText(
                typedArray.getResourceId(
                    R.styleable.TrainingCard_titleAttr,
                    R.string.prochain_entrainement
                )
            )

            val subtitle: CharSequence = resources.getText(
                typedArray.getResourceId(
                    R.styleable.TrainingCard_subtitleAttr,
                    R.string.description_du_prochain_entrainement
                )
            )

            // Can get String instead of CharSequence
            training_card_title.text = title
            training_card_subtitle.text = subtitle

            typedArray.recycle()
        }
    }

}