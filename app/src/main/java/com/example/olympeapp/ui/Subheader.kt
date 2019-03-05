package com.example.olympeapp.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.olympeapp.R
import kotlinx.android.synthetic.main.subheader.view.*

/**
 *
 * @author yanngodeau on 05/03/2019
 */

class Subheader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.subheader, this, true)
        orientation = VERTICAL

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.Subheader, 0, 0)

            val title: CharSequence = resources.getText(
                typedArray.getResourceId(
                    R.styleable.Subheader_SubheaderTitleAttr,
                    R.string.titre_de_la_partie
                )
            )

            val description: CharSequence = resources.getText(
                typedArray.getResourceId(
                    R.styleable.Subheader_SubheaderDescriptionAttr,
                    R.string.subheader_description
                )
            )

            subheader_title.text = title
            subheader_description.text = description

            typedArray.recycle()
        }
    }

}